import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;



/**
 * Created by Administrator on 6/23/2017.
 */
public class MsgRespond extends ListenerAdapter{
    public void onMessageReceived (MessageReceivedEvent event)
    {
        String message = event.getMessage().getContent().toLowerCase();
        if(message.startsWith("hello"))
        {
            String name = event.getAuthor().getName();
            String response = name + ", hello and welcome";
            event.getTextChannel().sendMessage(response).queue();
            /*
            Message message1 = event.getTextChannel().sentMessage(response).complete.queue();
            System.out.println(message1.getContent());
            */
        }
        else if (message.contains("list of work"))
        {
            String response = "1.something \n2.something2 \n3.something3";
            event.getTextChannel().sendMessage(response).queue();
        }
        else if (message.contains("kitty"))
        {
            String response = "ggez";
            event.getTextChannel().sendMessage(response).queue();
        }
        //else if (message.)
    }
}
