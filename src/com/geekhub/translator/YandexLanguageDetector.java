package com.geekhub.translator;

import com.geekhub.translator.core.language.Language;
import com.geekhub.translator.core.language.LanguageDetector;
import com.geekhub.translator.core.language.LanguageDetectorException;

public class YandexLanguageDetector implements LanguageDetector {

    private static final String YANDEX_LANGUAGE_DETECTOR_API_URL = "https://translate.yandex.net/api/v1.5/tr.json/detect?key=%s&text=%s";

    private final String apiKey;

    public YandexLanguageDetector(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public Language detect(String text) throws LanguageDetectorException {
        //TODO: Implement me
        return null;
    }
}
