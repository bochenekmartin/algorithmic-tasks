package com.martin.cme;

public class FastStringBuffer extends StringView {

    public FastStringBuffer(String content) {
        super(content);
    }

    public void append(String toBeAppended) {
        setContent(getContent() + toBeAppended);
    }
}
