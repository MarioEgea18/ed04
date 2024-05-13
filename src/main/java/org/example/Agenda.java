package org.example;

import java.util.*;

public class Agenda {
    private List<Persona> contacts; /** Lista de Contacto */

    /** Constructor de la clase Agenda */
    public Agenda() {
        this.contacts = new ArrayList<>(); /** Inicialización de la lista de contactos */
    }

    /** Método para agregar un contacto a la agenda */
    public void addContact(String name, String phone) {
        boolean exists = false; /** Variable para verificar si el contacto ya existe */

        /** Itera sobre la lista de contactos para verificar si ya existe un contacto con el mismo nombre */
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true; /** Si ya existe */
                c.getPhones().add(phone); /** Agrega el número de teléfono al contacto existente */
                break; /** Sale del bucle */
            }
        }

        /** Si el contacto no existe, crea uno nuevo y lo agrega a la lista */
        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /** Método para eliminar un contacto de la agenda */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        /** Itera sobre la lista de contactos */
        while (it.hasNext()) {
            Persona c = it.next();

            /** Si encuentra un contacto con el mismo nombre, lo elimina */
            if (c.getName().equalsIgnoreCase(name)) {
                it.remove(); /** Elimina el contacto */
            }
        }
    }

    /** Método para modificar el número de teléfono de un contacto */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                /** Busca el índice del número de teléfono antiguo */
                int index = phones.indexOf(oldPhone);

                /** Si encuentra el número de teléfono antiguo, lo reemplaza con el nuevo */
                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /** Método para obtener la lista de contactos */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}
