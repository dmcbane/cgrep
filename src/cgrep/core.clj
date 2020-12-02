(ns cgrep.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (let [tmp (str "Hello, " x "!")]
    (println tmp)
    tmp))

(defn lidar
  "Off just a bit."
  [dirname]
  (let [directory (clojure.java.io/file dirname)
        files (file-seq directory)]
    (for [f files]
      (let [ path (.getCanonicalPath f)]
        (println path)
        path))))

(defn -main
  "Entry point for application "
  [& args]
  (for [p args]
    (lidar p))))
