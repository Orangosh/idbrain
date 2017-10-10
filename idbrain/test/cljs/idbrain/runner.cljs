(ns idbrain.runner
  (:require  [clojure.test :as t]
             [doo.runner :refer-macros [doo-tests]]))

"weill tell doo what test to run"
(doo-tests "idbrain.core-test")
