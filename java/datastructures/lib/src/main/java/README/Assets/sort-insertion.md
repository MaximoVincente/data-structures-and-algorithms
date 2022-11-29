# Selection Sort

## Pseudocode

```pseudocode

SelectionSort(int[] arr)
    DECLARE n <-- arr.Length;
    FOR i = 0; i to n - 1
        DECLARE min <-- i;
        FOR j = i + 1 to n
            if (arr[j] < arr[min])
                min <-- j;

        DECLARE temp <-- arr[min];
        arr[min] <-- arr[i];
        arr[i] <-- temp;

```

## Trace

- Sample Array
![img_2.png](s1.jpg)

### Pass 1
Visualization:

![img.png](s2.jpg)


### Pass 2

- Visualization

![img_1.png](s3.jpg)

### Pass 3

- Visualization

![img_3.png](s4.jpg)

### Pass 4

- Visualization

![img_4.png](s5.jpg)

### Pass 5

- Visualization

![img_5.png](s6.jpg)

### Pass 6

- Visualization

![img_6.png](s7.jpg)
