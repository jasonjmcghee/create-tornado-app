import tornadofx.*

class BaseView: View() {

    override val root = pane {
        setPrefSize(800.0, 600.0)
    }
}