package com.martin.jmh;

import com.google.common.base.Splitter;

import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;

@SuppressWarnings("unused")
public class TestSplitter {

    private static final String line = "12 34";
    private static final int RUNS = 1000000;// 000000;

    public final void testSplit() {
        long start = System.nanoTime();
        for (int i = 0; i < RUNS; i++) {
            String[] st = line.split(" ");
            int x = Integer.parseInt(st[0]);
            int y = Integer.parseInt(st[1]);
        }
        System.out.println("Split: " + getString(start));
    }

    public final void testIndexOf() {
        long start = System.nanoTime();
        for (int i = 0; i < RUNS; i++) {
            int index = line.indexOf(' ');
            int x = Integer.parseInt(line.substring(0, index));
            int y = Integer.parseInt(line.substring(index + 1));
        }
        System.out.println("IndexOf: " + getString(start));
    }

    private String getString(long start) {
        return ((System.nanoTime() - start)/1_000_000) + " s";
    }

    public final void testTokenizer() {
        long start = System.nanoTime();
        for (int i = 0; i < RUNS; i++) {
            StringTokenizer st = new StringTokenizer(line, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
        }
        System.out.println("StringTokenizer: " + getString(start));
    }

    public final void testGuavaSplit() {
        Splitter split = Splitter.on(' ');
        long start = System.nanoTime();
        for (int i = 0; i < RUNS; i++) {
            Iterator<String> it = split.split(line).iterator();
            int x = Integer.parseInt(it.next());
            int y = Integer.parseInt(it.next());
        }
        System.out.println("GuavaSplit: " + getString(start));
    }

    static int[] pow = new int[] { 1, 10, 100, 1000, 10000, 100000 };






    public final void testIndexOf2() {
        long start = System.nanoTime();
        for (int i = 0; i < RUNS; i++) {

            int x = 0;
            int y = 0;

            int len = line.length();
            int index = len - 1;
            while (index > 0 && line.charAt(index) != ' ') {
                char c = line.charAt(index);
                switch (c) {
                    case '+':
                        break;
                    case '-':
                        y *= -1;
                        break;
                    default:
                        y += (c - '0') * pow[len - index - 1];
                        break;
                }

                index--;
            }

            len = index;
            index--;
            while (index >= 0) {
                char c = line.charAt(index);
                switch (c) {
                    case '+':
                        break;
                    case '-':
                        x *= -1;
                        break;
                    default:
                        x += (c - '0') * pow[len - index - 1];
                        break;
                }

                index--;
            }
        }
        System.out.println("IndexOf2: " + getString(start));
    }

    public static class CSV{
        public int x;
        public int y;
    }

    /*
    public final void testJacksonSplit() throws JsonProcessingException, IOException {
        long start = System.nanoTime();
        CsvMapper mapper = new CsvMapper();
        CsvSchema schema = CsvSchema.builder().addColumn("x", ColumnType.NUMBER).addColumn("y", ColumnType.NUMBER).setColumnSeparator(' ').build();
        ObjectReader r = mapper.reader(CSV.class).with(schema);
        for (int i = 0; i < RUNS; i++) {
            CSV csv = r.readValue(line);
        }
        System.out.println("CsvMapperSplit: " + (System.nanoTime() - start) + "ns");
    }

    public final void testJacksonSplitDoc() throws JsonProcessingException, IOException{

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < RUNS; i++) {
            builder.append(line);
            builder.append('\n');
        }
        String input = builder.toString();
        long start = System.nanoTime();

        CsvMapper mapper = new CsvMapper();
        CsvSchema schema = CsvSchema.builder().addColumn("x", ColumnType.NUMBER).addColumn("y", ColumnType.NUMBER).setColumnSeparator(' ').build();
        ObjectReader r = mapper.reader(CSV.class).with(schema);

        MappingIterator<CSV> it = r.readValues(input);
        while (it.hasNext()){
            CSV csv = it.next();
        }
        System.out.println("CsvMapperSplit_DOC: " + (System.nanoTime() - start) + "ns");
    }
*/
    public static void main(String[] args) throws IOException {
        //testAll
        TestSplitter testSplitter = new TestSplitter();
        testSplitter.testSplit();
        testSplitter.testIndexOf();
        testSplitter.testTokenizer();
        testSplitter.testGuavaSplit();
        testSplitter.testIndexOf2();
//        testSplitter.testJacksonSplit();
//        testJacksonSplitDoc();

        System.out.println("-------------");
        testSplitter.testSplit();
        testSplitter.testIndexOf();
        testSplitter.testTokenizer();
        testSplitter.testGuavaSplit();
        testSplitter.testIndexOf2();
//        testSplitter.testJacksonSplit();
//        testJacksonSplitDoc();

        System.out.println("-------------");
        testSplitter.testSplit();
        testSplitter.testIndexOf();
        testSplitter.testTokenizer();
        testSplitter.testGuavaSplit();
        testSplitter.testIndexOf2();
//        testSplitter.testJacksonSplit();
//        testJacksonSplitDoc();

    }

}
