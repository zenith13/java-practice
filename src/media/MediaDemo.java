//package media;
//
////import org.apache.commons.collections.CollectionUtils;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
///**
// * @author 002L1R744 on 12-10-2022
// */
//public class MediaDemo
//{
//    public static void main(String[] args)
//    {
//
//        final Optional<List<Object>> asd = Optional.of(Collections.emptyList());
//        if(asd.isPresent())
//        {
//            System.out.println("#################################");
//        }
//
//        final List<Object> testList = Collections.emptyList();
//        testList.stream().collect(Collectors.toList());
//        ImageData imageData = new ImageData();
//        imageData.setWidth("365");
//        ImageData imageData1 = new ImageData();
//        imageData1.setWidth("30");
//        ImageData imageData2 = new ImageData();
//        imageData2.setWidth("300");
//        ImageData imageData3 = new ImageData();
//        imageData3.setWidth("65");
//        ImageData imageData4 = new ImageData();
//        imageData4.setWidth("96");
//
//        List<ImageData> imageDataList = new ArrayList<>();
//        imageDataList.add(imageData);
//        imageDataList.add(imageData1);
//        imageDataList.add(imageData2);
//        imageDataList.add(imageData3);
//        imageDataList.add(imageData4);
//        sortMediasBasedOnWidth(imageDataList);
//
//        for (ImageData data : imageDataList)
//        {
//            System.out.println(data.getWidth());
//        }
//    }
//
//    public static List<ImageData> sortMediasBasedOnWidth(final List<ImageData> mediaDataList)
//    {
//        if (CollectionUtils.isNotEmpty(mediaDataList))
//        {
//            Collections.sort(mediaDataList, new Comparator<ImageData>()
//            {
//                @Override
//                public int compare(final ImageData imageData1, final ImageData imageData2)
//                {
//                    return compareImageData(imageData1, imageData2);
//                }
//            });
//        }
//        return mediaDataList;
//    }
//
//    public static int compareImageData(final ImageData imageData1, final ImageData imageData2)
//    {
//        if (imageData1 != null && imageData1.getWidth() != null)
//        {
//            if (imageData2 != null && imageData2.getWidth() != null)
//            {
//                return Integer.valueOf(imageData1.getWidth()).compareTo(Integer.valueOf(imageData2.getWidth()));
//            }
//            else
//            {
//                return 1;
//            }
//        }
//        else
//        {
//            if (imageData2 != null && imageData2.getWidth() != null)
//            {
//                return -1;
//            }
//        }
//        return 0;
//    }
//}
