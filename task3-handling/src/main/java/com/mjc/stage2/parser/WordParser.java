package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;

public class WordParser extends AbstractTextParser{
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] characters = string.toCharArray();
        for (char character : characters) {
            AbstractTextComponent symbolLeaf = new SymbolLeaf(character);
            abstractTextComponent.add(symbolLeaf);
        }
    }
}
