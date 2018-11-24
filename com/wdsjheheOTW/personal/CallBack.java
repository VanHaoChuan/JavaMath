import java.awt.Graphics;
import java.awt.event.ComponentEvent;
public interface CallBack{
    public void Draw(java.awt.Graphics graphics);
    public void WindowChanged(ComponentEvent componentEvent);
}