package org.wltea.analyzer.util;

import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.util.TokenizerFactory;
import org.apache.lucene.util.AttributeFactory;
import org.wltea.analyzer.lucene.IKTokenizer;

import java.util.Map;

/**
 * Created by jooop on 2017-05-02.
 */
public class IKTokenizerFactory extends TokenizerFactory {

    private boolean useSmart;

    public IKTokenizerFactory(Map<String, String> args) {
        super(args);
        useSmart = getBoolean(args,"useSmart",false);
    }

    public Tokenizer create(AttributeFactory attributeFactory) {
        Tokenizer tokenizer = new IKTokenizer(useSmart);
        return tokenizer;
    }
}
