/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author Thomas Burgos
 */
public class ComplexTask extends Task {

    @Override
    public String getDetails() {
        return "Detalles de Tarea";
    }

    public void addSubTask(Task task) {
    }
}
