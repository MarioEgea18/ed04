package org.example;

import java.util.ArrayList;
import java.util.List;

class Contacto {
    private String name; /** Nombre del contacto */
    private List<String> phones; /** Lista de números de teléfono del contacto */

    /** Constructor de la clase Contacto */
    public Contacto(String name, String phone) {
        this.name = name; /** Asigna el nombre del contacto */
        this.phones = new ArrayList<>(); /** Inicializa la lista de números de teléfono */
        this.phones.add(phone); /** Agrega el número de teléfono al contacto */
    }

    /** Método para obtener el nombre del contacto */
    public String getName() {
        return this.name;
    }

    /** Método para obtener la lista de números de teléfono del contacto */
    public List<String> getPhones() {
        return this.phones;
    }
}
