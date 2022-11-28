
;; Exerc 1
(defn square [x]
(* x x))

(map square [1 2 3 4 5])

;; Exerc 2

(defn factorial [n]
  (if (= n 0)
    1
    (* n (factorial (- n 1)))))
(factorial 5)

;; Exerc 3


(defn even? [n]
  (= (mod n 2) 0))

(defn odd? [n]
    (not (even? n)))

(defn print-even-odd [n]
    (if (even? n)
        (println n "is even")
        (println n "is odd")))

(defn print-even-odd-loop [n]
    (if (= n 0)
        (print-even-odd n)
        (do
            (print-even-odd n)
            (print-even-odd-loop (- n 1)))))

(print-even-odd-loop 100)
