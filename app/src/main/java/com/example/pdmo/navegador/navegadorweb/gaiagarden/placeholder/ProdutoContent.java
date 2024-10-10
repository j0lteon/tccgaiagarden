package com.example.pdmo.navegador.navegadorweb.gaiagarden.placeholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ProdutoContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<ProdutoItem> ITEMS = new ArrayList<ProdutoItem>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<String, ProdutoItem> ITEM_MAP = new HashMap<String, ProdutoItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createProdutoItem(i));
        }
    }

    private static void addItem(ProdutoItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static ProdutoItem createProdutoItem(int position) {
        return new ProdutoItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A placeholder item representing a piece of content.
     */
    public static class ProdutoItem {
        public final String id;
        public final String nome;
        public final String descricao;

        public ProdutoItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }

    }
}