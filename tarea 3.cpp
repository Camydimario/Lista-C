#include <stdio.h>
#include <stdlib.h>

typedef struct Nodo {
    int dato;
    struct Nodo* siguiente;
} Nodo;

typedef struct {
    Nodo* cabeza;
    int longitud;
} ListaEnlazada;

// Funciones

ListaEnlazada* crear_lista();
void agregar_elemento(ListaEnlazada* lista, int dato);
int obtener_largo(ListaEnlazada* lista);
int obtener_elemento(ListaEnlazada* lista, int indice);
int eliminar_elemento(ListaEnlazada* lista, int indice);
void imprimir_lista(ListaEnlazada* lista);

// Implementación de funciones

ListaEnlazada* crear_lista() {
    ListaEnlazada* lista = (ListaEnlazada*)malloc(sizeof(ListaEnlazada));
    lista->cabeza = NULL;
    lista->longitud = 0;
    return lista;
}

void agregar_elemento(ListaEnlazada* lista, int dato) {
    Nodo* nuevo_nodo = (Nodo*)malloc(sizeof(Nodo));
    nuevo_nodo->dato = dato;
    nuevo_nodo->siguiente = NULL;

    if (!lista->cabeza) {
        lista->cabeza = nuevo_nodo;
    } else {
        Nodo* actual = lista->cabeza;
        while (actual->siguiente) {
            actual = actual->siguiente;
        }
        actual->siguiente = nuevo_nodo;
    }

    lista->longitud++;
}

int obtener_largo(ListaEnlazada* lista) {
    return lista->longitud;
}

int obtener_elemento(ListaEnlazada* lista, int indice) {
    if (indice < 0 || indice >= lista->longitud) {
        return -1;
    }

    Nodo* actual = lista->cabeza;
    for (int i = 0; i < indice; i++) {
        actual = actual->siguiente;
    }

    return actual->dato;
}

int eliminar_elemento(ListaEnlazada* lista, int indice) {
    if (indice < 0 || indice >= lista->longitud) {
        return -1;
    }

    if (indice == 0) {
        Nodo* nodo_a_eliminar = lista->cabeza;
        lista->cabeza = lista->cabeza->siguiente;
        int dato = nodo_a_eliminar->dato;
        free(nodo_a_eliminar);
        lista->longitud--;
        return dato;
    } else {
        Nodo* actual = lista->cabeza;
        for (int i = 0; i < indice - 1; i++) {
            actual = actual->siguiente;
        }

        Nodo* nodo_a_eliminar = actual->siguiente;
        actual->siguiente = actual->siguiente->siguiente;
        int dato = nodo_a_eliminar->dato;
        free(nodo_a_eliminar);
        lista->longitud--;
        return dato;
    }
}

void imprimir_lista(ListaEnlazada* lista) {
    Nodo* actual = lista->cabeza;
    while (actual) {
        printf("%d -> ", actual->dato);
        actual = actual->siguiente;
    }
    printf("NULL\n");
}

// Programa principal

int main() {
    ListaEnlazada* mi_lista = crear_lista();

    // Agregar elementos
    agregar_elemento(mi_lista, 1);
    agregar_elemento(mi_lista, 2);
    agregar_elemento(mi_lista, 3);

    // Obtener largo de la lista
    printf("Largo de la lista: %d\n", obtener_largo(mi_lista));

    // Obtener elemento N
    printf("Elemento en la posición 1: %d\n", obtener_elemento(mi_lista, 1));

    // Eliminar elemento N
    eliminar_elemento(mi_lista, 1);

    // Imprimir lista
    imprimir_lista(mi_lista);

    return 0;
}