package homework_28;

public class Dictionary {

    private DictionaryPair[] storage;
    public Translator translator = new Translator();
    private int storageSize = 0;

    public Dictionary() {
        storage = new DictionaryPair[0];
    }

    public void put(String key, String value) {
        DictionaryPair[] newDict = new DictionaryPair[++storageSize];

        for (int i = 0; i < storage.length; i++) {
            newDict[i] = storage[i];
        }

        newDict[storageSize - 1] = new DictionaryPair(key, value);

        storage = newDict;
    }

    public String get(String key) {
        for (int i = 0; i < storage.length; i++) {
            if(storage[i].getKey().equals(key)) return storage[i].getValue();
        }

        return "";
    }

    public class Translator {
        public Translator() {}
        public String[] translate(String[] words) {
            String[] temp = new String[words.length];

            for (int i = 0; i < words.length; i++) {
                temp[i] = get(words[i]);
            }

            return temp;
        }
    }

    private class DictionaryPair {
        private String key;
        private String value;

        public DictionaryPair(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return key + "-" + value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}
