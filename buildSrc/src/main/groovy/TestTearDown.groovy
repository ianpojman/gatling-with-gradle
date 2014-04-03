import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class TestTearDown extends DefaultTask {

    @TaskAction
    def teardown() {
        // TODO: destroy test data using web service calls or directly with SQL
    }
}