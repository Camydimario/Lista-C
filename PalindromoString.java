String aMinusculas(String frase){
    return frase.toLowerCase();
}
String sinEspaciosNiSignos(String frase) {
    String aQuitar = " ,./?~!¡@#$%^&*()_+[]{}|;:'\"";
    String cadenaNormalizada = frase;
    for (int i = 0; i < aQuitar.length(); i++) {
        cadenaNormalizada = cadenaNormalizada.replace(String.valueOf(aQuitar.charAt(i)), "");
    }
    return cadenaNormalizada;
}

public String sinAcentos(String frase) {
    String fraseSinAcentos = frase;
    String conAcentos = "áéíóúüñÁÉÍÓÚÜÑ";
    String sinAcentos = "aeiouunAEIOUUN";

    for (int i = 0; i < conAcentos.length(); i++) {
        String letraConAcento = String.valueOf(conAcentos.charAt(i));
        String letraSinAcento = String.valueOf(sinAcentos.charAt(i));
        fraseSinAcentos = fraseSinAcentos.replace(letraConAcento, letraSinAcento);
    }
    return fraseSinAcentos;
}




String normalizar(String frase){
    String limpia = aMinusculas(frase);
    limpia = sinEspaciosNiSignos(limpia);
    limpia = sinAcentos(limpia);
    return limpia;
}

boolean esPalindromo(String frase){
boolean espalindromo = false;
    
    // Usamos el normalizar que ya tenés guardado y funciona
    String fraseLimpia = normalizar(frase);
    
    // Invertimos de forma nativa sin llamar a ningún método externo 'invertir'
    String fraseInvertida = new StringBuilder(fraseLimpia).reverse().toString();

    if (fraseLimpia.equals(fraseInvertida)) {
        espalindromo = true;
    }

    return espalindromo;
}

String poema = "'Amor azul' Ramera, de todo te di. Mariposa colosal, sí, yo de todo te di. Poda la rosa, Venus. El átomo como tal es un evasor alado. Pide, todo te doy: isla, sol, ocaso, pirámide. Todo te daré: mar, luz, aroma.";
System.out.println("¿El poema es palíndromo?: " + esPalindromo(poema));
normalizar(poema);
aMinusculas(poema);
sinEspaciosNiSignos(poema);
sinAcentos(poema);
