package qualiframe.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qualiframe.pages.TodoList;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoSteps {
	private TodoList todoList;
	public TodoSteps()
	{
   todoList = new TodoList();
	}

  @Given("^I am on the todo list$")
  public void iAmOnTheTodoList() {
    todoList.open();
    assertThat(todoList.getTitleText()).isEqualTo("todos");
  }

  @When("^I add a todo called \"(.*?)\"$")
  public void iAddATodoCalled(String todoName) {
    todoList.fillTodoField(todoName);
    todoList.submitTodo();
  }

  @Then("^I see a todo called \"(.*?)\"$")
  public void iSeeATodoCalled(String todoName) {
    assertThat(todoList.getTodoList()).contains(todoName);
  }
  public static void main(String[] args) {
	new TodoSteps().iAmOnTheTodoList();
}
}
