import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class TodosTest {
    @Test
    public void shouldFindFewTasks() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям в субботу");

        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "в субботу в 23.15"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] actual = todos.search("в субботу");
        Task[] expected = {simpleTask, meeting};
        Assertions.assertArrayEquals(expected, actual);
    }

@Test
public void shouldFindOneTask() {
    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям в субботу");

    String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
    Epic epic = new Epic(55, subtasks);

    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "в субботу в 23.15"
            );
    Todos todos = new Todos();

    todos.add(simpleTask);
    todos.add(epic);
    todos.add(meeting);

    Task[] actual = todos.search("Молоко");
    Task[] expected = {epic};
    Assertions.assertArrayEquals(expected, actual);
}

@Test
    public void shouldFindNoOneTask() {
    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям в субботу");

    String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
    Epic epic = new Epic(55, subtasks);

    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "в субботу в 23.15"
    );
    Todos todos = new Todos();

    todos.add(simpleTask);
    todos.add(epic);
    todos.add(meeting);

    Task[] actual = todos.search("Купить новые духи");
    Task[] expected = {};
    Assertions.assertArrayEquals(expected, actual);
}

}
