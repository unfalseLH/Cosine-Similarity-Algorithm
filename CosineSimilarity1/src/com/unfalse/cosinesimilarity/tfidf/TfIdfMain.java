
package com.unfalse.cosinesimilarity.tfidf;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TfIdfMain {
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        DocumentParser documentParser = new DocumentParser();
        documentParser.parseFiles("/Users/sailekyasheral/Desktop/unfalseFiles");
        documentParser.tfIdfCalculator(); //calculates tfidf
        documentParser.getCosineSimilarity(); //calculated cosine similarity   
    }
}
