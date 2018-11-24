import java.awt.event.ComponentEvent;

class Graphics{
    private int width = 600;
    private int height = 800;
    public Graphics(boolean net){
    CallBack callBack = new CallBack(){
           @Override
           public void Draw(java.awt.Graphics graphics){
            if(width != 0 && height != 0){
            graphics.drawLine((width/2), 0, (width/2), height);  
            graphics.drawString("X", (int)(width * 0.9f) , (height/2));
            //Draw X. 
            graphics.drawLine(0, (height/2), width, (height/2));
            graphics.drawString("Y", (width/2), (int)(height * 0.1f));
            //Draw Y.
            if(net){
                //for(int i = (int)(height / 10);i <= 10)
            }
        }
            else
            Draw(graphics);
           }
           @Override
           public void WindowChanged(ComponentEvent componentEvent){
            width = componentEvent.getComponent().getWidth();
            height = componentEvent.getComponent().getHeight();
            componentEvent.getComponent().setSize(width, height);
           }
        };
        GraphicsEnv graphicsEnv = new GraphicsEnv(callBack);
    }
}