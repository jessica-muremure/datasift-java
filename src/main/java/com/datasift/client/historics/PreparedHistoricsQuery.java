package com.datasift.client.historics;

import com.datasift.client.DataSiftResult;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * @author Courtney Robinson <courtney.robinson@datasift.com>
 */
public class PreparedHistoricsQuery extends DataSiftResult {
    @JsonProperty
    protected double dpus;
    @JsonProperty
    protected String id;
    @JsonProperty
    protected Availability availability;

    public double getDpus() {
        return dpus;
    }

    public String getId() {
        return id;
    }

    public Availability getAvailability() {
        return availability;
    }

    public static class Availability {
        @JsonProperty
        protected long start;
        @JsonProperty
        protected long end;
        @JsonProperty
        protected Map<String, Source> sources;

        public long getStart() {
            return start;
        }

        public long getEnd() {
            return end;
        }

        public Map<String, Source> getSources() {
            return sources;
        }
    }

    public static class Source {
        @JsonProperty
        protected long status;
        @JsonProperty
        protected List<Integer> versions;
        @JsonProperty
        protected Map<String, Integer> augmentations;

        public long getStatus() {
            return status;
        }

        public List<Integer> getVersions() {
            return versions;
        }

        public Map<String, Integer> getAugmentations() {
            return augmentations;
        }
    }
}
