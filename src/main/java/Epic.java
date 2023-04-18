public class Epic extends Task{
    protected String [] subtasks;

    public Epic (int id, String[] subtasks) {
        super(id); // вызов род конст-ра
        this.subtasks = subtasks; //запол-е своих полей
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtasks: subtasks){
            if (subtasks.contains(query)) {
              return true;
            }
        }
        return false;
    }
}
