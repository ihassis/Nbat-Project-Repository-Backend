package fr.codecake.airbnbclone.booking.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import fr.codecake.airbnbclone.booking.application.dto.BookedDateDTO;
import fr.codecake.airbnbclone.booking.application.dto.NewBookingDTO;  
import fr.codecake.airbnbclone.booking.domain.Booking;

@Mapper(componentModel = "spring")
public interface BookingMapper {
      @Mapping(target = "id", ignore = true)             
      @Mapping(target = "publicId", ignore = true)       
      @Mapping(target = "totalPrice", ignore = true)      
      @Mapping(target = "numberOfTravelers", ignore = true)
      @Mapping(target = "createdDate", ignore = true)     // JPA le générera automatiquement
      @Mapping(target = "lastModifiedDate", ignore = true)
      @Mapping(target = "fkTenant", ignore = true)        
      @Mapping(source = "listingPublicId", target = "fkListing")
    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}