package ch13.quiz02;

    public class Container<T, V> {
        private T Key;
        private V Value;

        public void set(T key, V value) {
            this.Key = key;
            this.Value = value;
        }

        public T getKey() {
            return Key;
        }

        public V getValue() {
            return Value;
        }
    }

