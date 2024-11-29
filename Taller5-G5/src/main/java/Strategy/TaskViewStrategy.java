/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Strategy;

/**
 *
 * @author Thomas Burgos
 */
import Factory.Task;

import java.util.List;

public interface TaskViewStrategy {
    void displayTasks(List<Task> tasks);
}