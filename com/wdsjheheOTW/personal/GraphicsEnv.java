import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
class GraphicsEnv implements CallBack{
    JFrame jFrame = new JFrame();
    CallBack callBack;
    ComponentAdapter componentAdapter = new ComponentAdapter() {
    @Override
    public void componentResized(ComponentEvent componentEvent){
        super.componentResized(componentEvent);
        callBack.WindowChanged(componentEvent);
    }
    };
    JPanel jPanel = new JPanel(){
        private static final long serialVersionUID = 1L;
        @Override
        public void paint(Graphics graphics){
            super.paint(graphics);
            callBack.Draw(graphics);
        }
    };
    public GraphicsEnv(CallBack _callBack){
        callBack = _callBack;
        jFrame.add(jPanel);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
        jFrame.addComponentListener(componentAdapter);
    }
}