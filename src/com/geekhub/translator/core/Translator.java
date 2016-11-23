package com.geekhub.translator.core;

public interface Translator {

    Translation translate(TranslationRequest translationRequest) throws TranslatorException;
}
