package org.example;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String name;
    private List<String> phones; /** Lista de números de teléfono del contacto */

    /** Constructor de la clase Contacto */
    public Persona(String name, String phone) {
        this.setName(name); /** Asigna el nombre del contacto */
        this.setPhones(new ArrayList<>()); /** Inicializa la lista de números de teléfono */
        this.getPhones().add(phone); /** Agrega el número de teléfono al contacto */
    }

    /** Método para obtener el nombre del contacto */
    public String getName() {
        return this.name;
    }

    /** Nombre del contacto */ /** Método para obtener la lista de números de teléfono del contacto */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
