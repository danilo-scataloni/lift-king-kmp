import androidx.compose.ui.window.ComposeUIViewController
import org.liftking.app.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
