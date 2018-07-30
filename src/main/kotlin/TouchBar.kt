import com.thizzer.jtouchbar.JTouchBar
import com.thizzer.jtouchbar.common.Image
import com.thizzer.jtouchbar.common.ImageName
import com.thizzer.jtouchbar.item.TouchBarItem
import com.thizzer.jtouchbar.item.view.TouchBarButton
import com.thizzer.jtouchbar.item.view.action.TouchBarViewAction

class TouchBar(val actionCallback: () -> Unit = {}) {

    val touchBar: JTouchBar

    init {
        touchBar = JTouchBar().apply {
            customizationIdentifier = "Test thingy"
            addItem(createTouchBarButton(actionCallback))
        }
    }

    fun createTouchBarButton(callback: () -> Unit): TouchBarItem {
        val touchBarButtonImg = TouchBarButton().apply {
            title = "Fullscreen"
            action = TouchBarViewAction { callback() }
            image = Image(ImageName.NSImageNameTouchBarColorPickerFill, false)
        }
        return TouchBarItem("Button_1", touchBarButtonImg, true)
    }
}