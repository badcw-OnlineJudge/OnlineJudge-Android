package top.verly_badcw.util;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ProblemList {
    @SerializedName("error")
    private boolean error;
    @SerializedName("data")
    private data data;

    public ProblemList() {
        data = new data();
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public ProblemList.data getData() {
        return data;
    }

    public void setData(ProblemList.data data) {
        this.data = data;
    }

    public class data {
        @SerializedName("results")
        private List<ProblemInfo> results;
        @SerializedName("total")
        private int total;

        public data() {
            results = new ArrayList<>();
        }

        public List<ProblemInfo> getResults() {
            return results;
        }

        public void setResults(List<ProblemInfo> results) {
            this.results = results;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }
}
