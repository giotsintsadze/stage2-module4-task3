package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent {

    private char value;

    public SymbolLeaf(char value) {
        super(TextComponentType.SYMBOL);
        this.value = value;
    }

    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Cannot add to SymbolLeaf");
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Cannot remove from SymbolLeaf");
    }

    @Override
    public int getSize() {
        return 1;
    }
}
