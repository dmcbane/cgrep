(ns cgrep.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (let [tmp (str "Hello, " x "!")]
    (println tmp)
    tmp))

(defn -main
  "Entry point for application "
  [& args]
  (println (count args))
  (for [arg args]
    (foo arg)))
