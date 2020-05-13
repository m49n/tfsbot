package services;

import com.google.inject.ImplementedBy;
import model.TFile;
import model.telegram.api.*;
import services.impl.TgApiReal;

import java.util.concurrent.CompletionStage;

/**
 * @author Denis Danilin | denis@danilin.name
 * 05.05.2020
 * tfs ☭ sweat and blood
 */
@ImplementedBy(TgApiReal.class)
public interface TgApi {
    void sendFile(TFile file, long chatId);

    CompletionStage<ApiMessageReply> sendMessage(TextRef text);

    CompletionStage<ApiMessageReply> updateMessage(UpdateMessage update);

    CompletionStage<Void> deleteMessage(DeleteMessage deleteMessage);

    void sendCallbackAnswer(CallbackAnswer callbackAnswer);
}
