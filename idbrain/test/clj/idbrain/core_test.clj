(ns idbrain.core-test
  (:require [idbrain.core :as sut]
            [clojure.test :as t]))

(t/deftest testing-add
  (t/is (= (sut/adding 1 2) 3)))
