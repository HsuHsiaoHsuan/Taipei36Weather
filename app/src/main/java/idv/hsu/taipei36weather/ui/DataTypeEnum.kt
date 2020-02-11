package idv.hsu.taipei36weather.ui

enum class DataTypeEnum(val value: Int) {
    TXT(0),
    PIC(1);

    companion object {
        private val map = values().associateBy(DataTypeEnum::value)
        fun fromInt(type: Int) = map[type]
    }
}