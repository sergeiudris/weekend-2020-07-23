(ns project.ext.render.proc)


(defn create-proc-ext
  [channels]
  (go (loop []
        (let [v (<! (chan 1))])))
  (with-meta
    {}
    {`mount (fn [_]
              (render.main/-main))
     `unmount (fn [_])}))

