    public class Counter {
        private int count; // a simple integer instance variable
        public Counter( ) { // default constructor (count is 0)
        }
        public Counter(int initial) // an alternate constructor
        { count = initial; }
        public int getCount( ) // an accessor method
        { return count; }
        public void increment() // an update method
        { count++; }
        public void increment(int delta) // update method with param
        { count += delta; }
        public void reset() // an update method
        { count = 0; }
    }

