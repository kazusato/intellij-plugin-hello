package kazusato.intellij.plugin;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class HelloPluginAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Notifications.Bus.notify(
                new Notification("kazusato", "Hello Plugin!",
                        "Hello, this is a sample plugin!", NotificationType.INFORMATION)
        );
    }
}
