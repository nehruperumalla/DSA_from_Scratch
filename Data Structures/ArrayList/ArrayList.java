public class ArrayList {
    int length;
    int size;
    int[] array;
        public ArrayList() {
            length = 0;
            size = 10;
            array = new int[size];
        }

        private void resize() {
            int[] temp_array = this.array;
            this.array = new int[temp_array.length*2];
            for(int i = 0; i < temp_array.length; i++) {
                this.array[i] = temp_array[i];
            }
        }

        public void add(int element) {
            if(this.array.length == this.length) {
                resize();
            }
            this.array[this.length++] = element;
        }

        public void add(int index, int element) {
            if(this.array.length == this.length) {
                resize();
            }
            for(int i = this.length-1; i >= index; i--) {
                this.array[i+1] = this.array[i];
            }
            this.array[index] = element;
            this.length++;
        }

        public boolean contains(int item) {
            for(int element : this.array) {
                if(element == item) {
                    return true;
                }
            }
            return false;
        }

        public int get(int element) {
            for(int i = 0; i < this.length; i++) {
                if(element == this.array[i]) {
                    return i;
                }
            }
            return -1;
        }

        public boolean delete(int element) {
            ele_pos = this.get(element)
            if(ele_pos != -1) {
                for(int i = ele_pos; i < this.length; i++) {
                    this.array[i] = this.array[i+1]
                }
                return true;
            }
            this.length--;
            return false;
        }

        public void clear() {
            this.array = new int[this.size];
        }

        public int size() {
            return this.size;
        }

        public String toString() {
            String output = "[";
            if(this.length > 0) {
                for(int i = 0; i < this.length - 1; i++) {
                    output += this.array[i] + ", ";
                }
                output += this.array[this.length - 1];
            }
            output += "]";
            return output;
        }
}