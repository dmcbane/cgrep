(ns cgrep.core)

;; (defn foo
;;   "I don't do a whole lot."
;;   [x]
;;   (let [tmp (str "Hello, " x "!")]
;;     (println tmp)
;;     tmp))

(defn lidar
  "Off just a bit."
  [ dirname ]
  (let [ directory (clojure.java.io/file dirname)
         files (file-seq directory) ]
    (for [ f files :when (.isFile f)]
      (.getCanonicalPath f))))

(defn -main
  "Application Entry Point"
  [ & args ]
  (for [ p args ]
    (lidar p)))
