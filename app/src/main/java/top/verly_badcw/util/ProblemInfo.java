package top.verly_badcw.util;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import static top.verly_badcw.InJavaResources.INTNULL;

public class ProblemInfo {
    @SerializedName("id")
    private int id;
    @SerializedName("tags")
    private List<String> tags;
    @SerializedName("created_by")
    private created_by created_by;
    @SerializedName("template")
    private template template;
    @SerializedName("_id")
    private String _id;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("input_description")
    private String input_description;
    @SerializedName("output_description")
    private String output_description;
    @SerializedName("sample")
    private List<sample> sample;
    @SerializedName("hint")
    private String hint;
    @SerializedName("languages")
    private List<String> languages;
    @SerializedName("create_time")
    private String create_time;
    @SerializedName("last_update_time")
    private String last_update_time;
    @SerializedName("time_limit")
    private int time_limit;
    @SerializedName("memory_limit")
    private int memory_limit;
    @SerializedName("spj")
    private boolean spj;
    @SerializedName("spj_language")
    private String spj_language;
    @SerializedName("rule_type")
    private String rule_type;
    @SerializedName("difficulty")
    private String difficulty;
    @SerializedName("source")
    private String source;
    @SerializedName("totle_score")
    private int totle_score;
    @SerializedName("submission_number")
    private int submission_number;
    @SerializedName("accepted_number")
    private int accepted_number;
    @SerializedName("statistic_info")
    private statistic_info statistic_info;
    @SerializedName("contest")
    private String contest;
    @SerializedName("my_status")
    private int my_status;

    public ProblemInfo() {
        my_status = INTNULL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ProblemInfo.created_by getCreated_by() {
        return created_by;
    }

    public void setCreated_by(ProblemInfo.created_by created_by) {
        this.created_by = created_by;
    }

    public ProblemInfo.template getTemplate() {
        return template;
    }

    public void setTemplate(ProblemInfo.template template) {
        this.template = template;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInput_description() {
        return input_description;
    }

    public void setInput_description(String input_description) {
        this.input_description = input_description;
    }

    public String getOutput_description() {
        return output_description;
    }

    public void setOutput_description(String output_description) {
        this.output_description = output_description;
    }

    public List<ProblemInfo.sample> getSample() {
        return sample;
    }

    public void setSample(List<ProblemInfo.sample> sample) {
        this.sample = sample;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getLast_update_time() {
        return last_update_time;
    }

    public void setLast_update_time(String last_update_time) {
        this.last_update_time = last_update_time;
    }

    public int getTime_limit() {
        return time_limit;
    }

    public void setTime_limit(int time_limit) {
        this.time_limit = time_limit;
    }

    public int getMemory_limit() {
        return memory_limit;
    }

    public void setMemory_limit(int memory_limit) {
        this.memory_limit = memory_limit;
    }

    public boolean isSpj() {
        return spj;
    }

    public void setSpj(boolean spj) {
        this.spj = spj;
    }

    public String getSpj_language() {
        return spj_language;
    }

    public void setSpj_language(String spj_language) {
        this.spj_language = spj_language;
    }

    public String getRule_type() {
        return rule_type;
    }

    public void setRule_type(String rule_type) {
        this.rule_type = rule_type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getTotle_score() {
        return totle_score;
    }

    public void setTotle_score(int totle_score) {
        this.totle_score = totle_score;
    }

    public int getSubmission_number() {
        return submission_number;
    }

    public void setSubmission_number(int submission_number) {
        this.submission_number = submission_number;
    }

    public int getAccepted_number() {
        return accepted_number;
    }

    public void setAccepted_number(int accepted_number) {
        this.accepted_number = accepted_number;
    }

    public ProblemInfo.statistic_info getStatistic_info() {
        return statistic_info;
    }

    public void setStatistic_info(ProblemInfo.statistic_info statistic_info) {
        this.statistic_info = statistic_info;
    }

    public String getContest() {
        return contest;
    }

    public void setContest(String contest) {
        this.contest = contest;
    }

    public int getMy_status() {
        return my_status;
    }

    public void setMy_status(int my_status) {
        this.my_status = my_status;
    }

    class created_by {
        @SerializedName("id")
        private int id;
        @SerializedName("username")
        private String username;
        @SerializedName("real_name")
        private String real_name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getReal_name() {
            return real_name;
        }

        public void setReal_name(String real_name) {
            this.real_name = real_name;
        }

    }

    class template {
    }

    class sample {
        @SerializedName("input")
        private String input;
        @SerializedName("output")
        private String output;

        public String getInput() {
            return input;
        }

        public void setInput(String input) {
            this.input = input;
        }

        public String getOutput() {
            return output;
        }

        public void setOutput(String output) {
            this.output = output;
        }
    }

    class statistic_info {
        @SerializedName("-2")
        private int COMPILE_ERROR;
        @SerializedName("-1")
        private int WRONG_ANSWER;
        @SerializedName("0")
        private int ACCEPTED;
        @SerializedName("1")
        private int CPU_TIME_LIMIT_EXCEEDED;
        @SerializedName("2")
        private int REAL_TIME_LIMIT_EXCEEDED;
        @SerializedName("3")
        private int MEMORY_LIMIT_EXCEEDED;
        @SerializedName("4")
        private int RUNTIME_ERROR;
        @SerializedName("5")
        private int SYSTEM_ERROR;
        @SerializedName("6")
        private int PENDING;
        @SerializedName("7")
        private int JUDGING;
        @SerializedName("8")
        private int PARTIALLY_ACCEPTED;

        public int getCOMPILE_ERROR() {
            return COMPILE_ERROR;
        }

        public void setCOMPILE_ERROR(int COMPILE_ERROR) {
            this.COMPILE_ERROR = COMPILE_ERROR;
        }

        public int getWRONG_ANSWER() {
            return WRONG_ANSWER;
        }

        public void setWRONG_ANSWER(int WRONG_ANSWER) {
            this.WRONG_ANSWER = WRONG_ANSWER;
        }

        public int getACCEPTED() {
            return ACCEPTED;
        }

        public void setACCEPTED(int ACCEPTED) {
            this.ACCEPTED = ACCEPTED;
        }

        public int getCPU_TIME_LIMIT_EXCEEDED() {
            return CPU_TIME_LIMIT_EXCEEDED;
        }

        public void setCPU_TIME_LIMIT_EXCEEDED(int CPU_TIME_LIMIT_EXCEEDED) {
            this.CPU_TIME_LIMIT_EXCEEDED = CPU_TIME_LIMIT_EXCEEDED;
        }

        public int getREAL_TIME_LIMIT_EXCEEDED() {
            return REAL_TIME_LIMIT_EXCEEDED;
        }

        public void setREAL_TIME_LIMIT_EXCEEDED(int REAL_TIME_LIMIT_EXCEEDED) {
            this.REAL_TIME_LIMIT_EXCEEDED = REAL_TIME_LIMIT_EXCEEDED;
        }

        public int getMEMORY_LIMIT_EXCEEDED() {
            return MEMORY_LIMIT_EXCEEDED;
        }

        public void setMEMORY_LIMIT_EXCEEDED(int MEMORY_LIMIT_EXCEEDED) {
            this.MEMORY_LIMIT_EXCEEDED = MEMORY_LIMIT_EXCEEDED;
        }

        public int getRUNTIME_ERROR() {
            return RUNTIME_ERROR;
        }

        public void setRUNTIME_ERROR(int RUNTIME_ERROR) {
            this.RUNTIME_ERROR = RUNTIME_ERROR;
        }

        public int getSYSTEM_ERROR() {
            return SYSTEM_ERROR;
        }

        public void setSYSTEM_ERROR(int SYSTEM_ERROR) {
            this.SYSTEM_ERROR = SYSTEM_ERROR;
        }

        public int getPENDING() {
            return PENDING;
        }

        public void setPENDING(int PENDING) {
            this.PENDING = PENDING;
        }

        public int getJUDGING() {
            return JUDGING;
        }

        public void setJUDGING(int JUDGING) {
            this.JUDGING = JUDGING;
        }

        public int getPARTIALLY_ACCEPTED() {
            return PARTIALLY_ACCEPTED;
        }

        public void setPARTIALLY_ACCEPTED(int PARTIALLY_ACCEPTED) {
            this.PARTIALLY_ACCEPTED = PARTIALLY_ACCEPTED;
        }
    }
}
