import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId

fun main() {
	val bot = bot {
		token = "{ENTER YOUR TELEGRAM BOT TOKEN HERE}"
		dispatch {
			text {
				if("宝塔" in text || "BTPanel" in text) {
					bot.sendMessage(ChatId.fromId(message.chat.id), text = "宝塔面板，这种国人做的，还要绑手机号的，你们居然敢用，心真大")
				}
                if("宝塔面板", "这种国人做的", "还要绑手机号的", "你们居然敢用", "心真大" in text) {
                    bot.sendMessage(ChatId.fromId(message.chat.id), text = "想骗你大叠复读是吧")
                }
			}
		}
	}
	bot.startPolling()
}
