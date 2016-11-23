package com.geekhub.translator;

import com.geekhub.translator.core.Translation;
import com.geekhub.translator.core.TranslationRequest;
import com.geekhub.translator.core.Translator;
import com.geekhub.translator.core.TranslatorException;
import com.geekhub.translator.core.language.Language;
import com.geekhub.translator.core.language.LanguageDetector;

public class YandexTranslator implements Translator {

    private static final String YANDEX_TRANSLATOR_API_URL = "https://translate.yandex.net/api/v1.5/tr.json/translate?key=%s&text=%s&lang=%s";

    private final String apiKey;
    private final LanguageDetector languageDetector;

    public YandexTranslator(String apiKey, LanguageDetector languageDetector) {
        this.apiKey = apiKey;
        this.languageDetector = languageDetector;
    }

    @Override
    public Translation translate(TranslationRequest translationRequest) throws TranslatorException {
        //TODO: Implement me
        return null;
    }

    private String prepareLanguageDirection(Language from, Language to) {
        return from.getCode() + "-" + to.getCode();
    }
}
