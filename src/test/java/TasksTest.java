import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TasksTest {
        @Test
        public void ShouldFindMatchesSimpleTask() {
            SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

            boolean trueExpected = true;
            boolean trueActual = simpleTask.matches("Позвонить родителям");
            Assertions.assertEquals(trueExpected, trueActual);

            boolean falseExpected = false;
            boolean falseActual = simpleTask.matches("Узнать как у них дела");
            Assertions.assertEquals(falseExpected, falseActual);
        }

        @Test
        public void shouldFindMatchesEpic() {
            String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
            Epic epic = new Epic(55, subtasks);

            boolean trueExpected = true;
            boolean trueActual = epic.matches("Яйца");
            Assertions.assertEquals(trueExpected, trueActual);

            boolean falseExpected = false;
            boolean falseActual = epic.matches("Эклеры");
            Assertions.assertEquals(falseExpected, falseActual);
        }

        @Test
        public void shouldFindMatchesMeeting() {
            Meeting meeting = new Meeting(3,
                    "Подтвердить встречу",
                    "Подбор квартиры",
                    "15:00, 12 апреля 2022"
            );
            boolean trueExpected = true;
            boolean trueActual = meeting.matches("15:00, 12 апреля 2022");
            Assertions.assertEquals(trueExpected, trueActual);

            boolean falseExpected = false;
            boolean falseActual = meeting.matches("Через 3 дня");
            Assertions.assertEquals(falseExpected, falseActual);
        }
    }