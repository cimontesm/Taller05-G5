/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author Thomas Burgos
 */
public class SimpleTaskFactory implements TaskFactory {

    @Override
    public Task createTask(String details) {
        Task task = new SimpleTask();
        task.name = details;
        return task;
    }
}
