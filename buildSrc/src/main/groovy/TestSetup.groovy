import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class TestSetup extends DefaultTask {

    @TaskAction
    def setup() {
        // TODO: setup test data using web service calls or directly with SQL
        // TODO: generate feeder files for Gatling
    }
}