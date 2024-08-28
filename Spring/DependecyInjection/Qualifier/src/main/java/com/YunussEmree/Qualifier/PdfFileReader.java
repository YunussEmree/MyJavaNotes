package com.YunussEmree.Qualifier;

import org.springframework.stereotype.Component;

@Component("pdfFileReader")
public class PdfFileReader implements Reader {

    @Override
    public String readFile() {
        return "Reading a PDF file";
    }

}
