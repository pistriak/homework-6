package com.geekhub.translator;

import com.geekhub.translator.core.Translation;
import com.geekhub.translator.core.TranslationRequest;
import com.geekhub.translator.core.Translator;
import com.geekhub.translator.core.TranslatorException;
import com.geekhub.translator.core.language.Language;
import com.geekhub.translator.core.language.LanguageDetector;
import com.geekhub.translator.core.language.LanguageDetectorException;
import com.geekhub.translator.core.language.UnknownLanguageException;

import java.io.IOException;
import java.util.Scanner;

public class TranslatorController {

    public static void main(String[] args) throws LanguageDetectorException, IOException {
        LanguageDetector languageDetector = null; //TODO: Initialize me
        Translator translator = null; //TODO: Initialize me

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if ("exit".equals(text)) {
                break;
            }

            try {
                String targetLanguage = scanner.nextLine();
                TranslationRequest translationRequest = new TranslationRequest(text, Language.find(targetLanguage));
                Translation translation = translator.translate(translationRequest);

                System.out.println("Original text: " + translation.getOriginalText());
                System.out.println("Original language: " + translation.getOriginalLanguage());

                System.out.println("Translated text: " + translation.getTranslatedText());
                System.out.println("Target language: " + translation.getTargetLanguage());
            } catch (UnknownLanguageException e) {
                System.out.println("Language '" + e.getUnknownLanguage() + "' is not supported yet");
                break;
            } catch (TranslatorException e) {
                System.out.println("Something went wrong during translating");
                break;
            }
        }
    }
}
