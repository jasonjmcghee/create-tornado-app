import javafx.stage.Stage
import tornadofx.*

class BaseApp: App(BaseView::class) {
    override fun start(stage: Stage) {
        super.start(stage)
        TouchBar {
            stage.isFullScreen = !stage.isFullScreen
        }.run {
            touchBar.show(stage)
        }
    }
}